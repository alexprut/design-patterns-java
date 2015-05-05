class ProxyProtectedFile extends File {
    public String read() {
        if (isProtected)
            return "File is protected";
        else
            return "Read protected File";
    }

    public void setProtection(boolean isProtected) {
        this.isProtected = isProtected;
    }
}
