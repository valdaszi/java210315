package lt.bit.p0525;

public class Man extends Thing {

    private int rank;

    public Man(String title, int rank) {
        super(title);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
