class Salesperson extends employee
{
    public void calculateSalary()
    {
        System.out.println("The salary =" + (11000 + 700 - 1500));
    }
    public void getDetails()
    {
        super.getDetails();
        System.out.println( name +","+ age +","+ profession);

    }
    public void performTask()
    {
        super.performTask();
        System.out.println(" you need to sales more to persons");
    }
}