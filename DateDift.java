
public class DateDift {
    private int new_Year,new_Month,new_DateOfMonth;
    private int old_Year,old_Month,old_DateOfMonth;
    private int Year,Month,DayOfMonth;
    DateDift(int new_Year,int new_Month,int new_DateOfMonth,int old_Year, int old_Month,int old_DateOfMonth){
        this.new_Year = new_Year;
        this.new_Month = new_Month;
        this.new_DateOfMonth = new_DateOfMonth;
        this.old_Year = old_Year;
        this.old_Month = old_Month;
        this.old_DateOfMonth = old_DateOfMonth;
        Calculate();
    }

    public DateDift(String newDate, String oldDate, String Format){
        boolean flag=true;
        String [] date1 = Split(newDate);
        String [] date2 = Split(oldDate);
        if(Format.toLowerCase()=="dd/mm/yyy"||Format.toLowerCase()=="dd-mm-yyy"){
            this.new_DateOfMonth = Integer.parseInt(date1[0]);
            this.new_Month = Integer.parseInt(date1[1]);
            this.new_Year = Integer.parseInt(date1[2]);
            this.old_DateOfMonth = Integer.parseInt(date2[0]);
            this.old_Month = Integer.parseInt(date2[1]);
            this.old_Year = Integer.parseInt(date2[2]);
        } else if(Format.toLowerCase()=="mm/dd/yyy"||Format.toLowerCase()=="mm-dd-yyy"){
            this.new_DateOfMonth = Integer.parseInt(date1[1]);
            this.new_Month = Integer.parseInt(date1[0]);
            this.new_Year = Integer.parseInt(date1[2]);
            this.old_DateOfMonth = Integer.parseInt(date2[1]);
            this.old_Month = Integer.parseInt(date2[0]);
            this.old_Year = Integer.parseInt(date2[2]);

        }else if(Format.toLowerCase()=="yyy/mm/dd"||Format.toLowerCase()=="yyy-mm-dd"){
            this.new_DateOfMonth = Integer.parseInt(date1[2]);
            this.new_Month = Integer.parseInt(date1[1]);
            this.new_Year = Integer.parseInt(date1[0]);
            this.old_DateOfMonth = Integer.parseInt(date2[2]);
            this.old_Month = Integer.parseInt(date2[1]);
            this.old_Year = Integer.parseInt(date2[0]);

        } else if(Format.toLowerCase()=="yyy/dd/mm"||Format.toLowerCase()=="yyy-dd-mm"){
            this.new_DateOfMonth = Integer.parseInt(date1[1]);
            this.new_Month = Integer.parseInt(date1[2]);
            this.new_Year = Integer.parseInt(date1[0]);
            this.old_DateOfMonth = Integer.parseInt(date2[1]);
            this.old_Month = Integer.parseInt(date2[2]);
            this.old_Year = Integer.parseInt(date2[0]);

        } else{
            flag=false;
        }
        if(flag)
            Calculate();
    }

    String[] Split(String date){
        if(date.indexOf('-')>=0){
            return date.split("-");
        }else if(date.indexOf('/')>=0){
            return date.split("/");
        }
        return null;
    }
    void Calculate(){
        if(new_DateOfMonth<old_DateOfMonth){
            setMonth(new_Month);
            this.DayOfMonth = new_DateOfMonth - old_DateOfMonth;
        }else{
            this.DayOfMonth = new_DateOfMonth - old_DateOfMonth;
        }
        if(new_Month<old_Month){
            this.new_Year -=1;
            this.new_Month += 12;
            this.Month = new_Month - old_Month;
        }else{
            this.Month = new_Month - old_Month;
        }
        this.Year = new_Year - old_Year;
    }
    boolean LeapYear(int year){
        if(((year % 4 == 0 )&&( year % 100 != 0))|| (year % 400 == 0)){
            return true;
        }
        return false;
    }

    void setMonth(int month){

        switch(month){
            case 1: this.new_DateOfMonth = new_DateOfMonth + 31;
                this.new_Month -=1;
                break;
            case 2: this.new_DateOfMonth =(LeapYear(new_Year))?(new_DateOfMonth + 29):(new_DateOfMonth + 28);
                this.new_Month -=1;
                break;
            case 3:this.new_DateOfMonth = new_DateOfMonth + 31;
                this.new_Month -=1;
                break;
            case 4:this.new_DateOfMonth = new_DateOfMonth + 30;
                this.new_Month -=1;
                break;
            case 5:this.new_DateOfMonth = new_DateOfMonth + 31;
                this.new_Month -=1;
                break;
            case 6:this.new_DateOfMonth = new_DateOfMonth + 30;
                this.new_Month -=1;
                break;
            case 7:this.new_DateOfMonth = new_DateOfMonth + 31;
                this.new_Month -=1;
                break;
            case 8:this.new_DateOfMonth = new_DateOfMonth + 31;
                this.new_Month -=1;
                break;
            case 9:this.new_DateOfMonth = new_DateOfMonth + 30;
                this.new_Month -=1;
                break;
            case 10:this.new_DateOfMonth = new_DateOfMonth + 31;
                this.new_Month -=1;
                break;
            case 11:this.new_DateOfMonth = new_DateOfMonth + 30;
                this.new_Month =1;
                break;
            case 12:this.new_DateOfMonth = new_DateOfMonth + 31;
                this.new_Month =1;
                break;

        }

    }

    public int getYear(){
        return Year;
    }
    public int getMonth(){
        return Month;
    }
    public int getDayOfMonth(){
        return DayOfMonth;
    }
    public int getAllMonth(){
        return ((Year*12)+Month);
    }
    public int getAllDayOfMonth(){
        return ((Year*365)+(Month*30)+DayOfMonth);
    }
    public long getInHour(){
        return (getAllDayOfMonth()*24);
    }
    public long getMints(){
        return (getAllDayOfMonth()*24*60);
    }
    public long getSecond(){
        return (getAllDayOfMonth()*24*60*60);
    }
}
