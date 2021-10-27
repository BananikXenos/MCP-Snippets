public interface MultiThreadDownloadListener {
    public void onStart(String fname, int fsize, long timeStart);

    public void onStartThread(int id, long timeStart);

    public void onUpdate(int speedKB, int totalDownloadedKB, float percentage, int Threads);

    public void onComplete(long timeElapsed, long timeStart, long TimeEnd, long avgSpeed);

    public void onTempFileClean(long onDelteTime);

    public void onMultiThreadPartDownloaded(int partID);
}
