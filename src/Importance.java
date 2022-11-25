public enum Importance {

    MEDIUM(0),
    LOW(1),
    HIGH(2);

    private int prio;

Importance(int prio){
    this.prio =prio;
}

    public int getPrio() {
        return prio;
    }
}


