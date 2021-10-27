# MultiThread Downloading

Downloads file in multiple threads.

## Installation

Just download or copy the file and you are good to go.

## Usage

```java
import java.awt.Color;

               new Thread(() -> {
                    try {
                        //Arguments(Url, Path, ThreadsNumber, File Timeout, Listener [Optional] - To retrive info)
                        new HttpDownloader("http://ipv4.download.thinkbroadband.com/200MB.zip","C:/downloading/testfile.bin",5 ,5000, new MultiThreadDownloadListener(){
                            public void onStart(String fname, int fsize, long timeStart) {
                                System.out.println(fname + " : " + fsize + " : " + timeStart);
                            }

                            public void onStartThread(int id, long timeStart) {
                                System.out.println("Thead " + id + " started [" + timeStart + "]");
                            }

                            public void onUpdate(int speedKB, int totalDownloaded, float totalDownloadedFixed, int Threads) {
                                System.out.println(speedKB + " : " + totalDownloaded + " : " + totalDownloadedFixed + " : " + Threads);
                            }

                            public void onComplete(long timeElapsed, long timeStart, long TimeEnd, long avgSpeed) {
                                System.out.println("DONE DOWNLOADING IN " + timeElapsed + " : avgSpeed: " + avgSpeed);
                            }

                            public void onTempFileClean(long onDelteTime) {
                                System.out.println("Cleaned temp Files [" + onDelteTime + "]");
                            }

                            public void onMultiThreadPartDownloaded(int partID) {
                                System.out.println("Downloaded part number " + partID);
                            }
                        }).get();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)