package Day27;

public class Attributes {
    private String btitle;
    private String bauthor;
    private int ISBN;
    private int numpages;
    private boolean availailability;
    private String borrowdate;
    private String returndate;

    public Attributes(String btitle, String bauthor, int ISBN, int numpages, boolean availailability, String borrowdate, String returndate) {
        this.availailability = availailability;
        this.bauthor = bauthor;
        this.btitle = btitle;
        this.borrowdate = borrowdate;
        this.returndate = returndate;
        this.ISBN = ISBN;
        this.numpages = numpages;

    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumpages() {
        return numpages;
    }

    public void setNumpages(int numpages) {
        this.numpages = numpages;
    }

    public boolean getAvailailability() {
        return availailability;
    }

    public void setAvailailability(boolean availailability) {
        this.availailability = availailability;

    }

    public String getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(String borrowdate) {
        this.borrowdate = borrowdate;

    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public void borrowDate(String date){


        if(this.availailability) {

            this.availailability = false;
            String[] arr = date.split("/");

            int month = Integer.parseInt(arr[0]);

            int day = Integer.parseInt(arr[1]);

            if ((month > 0 && month < 13) && (day > 0 && day < 32)) {
                this.borrowdate=date;

            } else{
                System.out.println("Date is not correct");
            }


            } else {
            System.out.println("Date is wrong");

        }


    }

    @Override
    public String toString() {
        return "Attributes{" +
                "btitle='" + btitle + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", ISBN=" + ISBN +
                ", numpages=" + numpages +
                ", availailability=" + availailability +
                ", borrowdate='" + borrowdate + '\'' +
                ", returndate='" + returndate + '\'' +
                '}';
    }
}


