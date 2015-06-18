class ProxyProtectedFile extends File {
    private File file = null;

    public ProxyProtectedFile () {
        this.file = new PublicFile();
    }

    public String read() {
        if (isProtected)
            return "File is protected";
        else
            return this.file.read();
    }

    public void setProtection(boolean isProtected) {
        this.isProtected = isProtected;
    }
}
