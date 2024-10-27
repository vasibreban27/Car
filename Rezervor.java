public class Rezervor {
    private int maxCapacity;
    private int currentCapacity;

    public Rezervor(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }
    public Rezervor()
    {
        this(100,50);
    }

    public void fillGasTank(int level)
    {
        if(level < maxCapacity)
            currentCapacity = level;
        else
            currentCapacity = maxCapacity;
    }
    public void fillGasTank(int level,int addLevel)
    {
        int sum = level + addLevel;
        if(sum < maxCapacity && sum> currentCapacity)
            currentCapacity = sum;
        else
            currentCapacity = maxCapacity;
    }
    public void emptyGasTank(int usedFuel)
    {
        currentCapacity -= usedFuel;
    }
    public int getMaxCapacity()
    {
        return maxCapacity;
    }
    public int getCurrentCapacity()
    {
        return currentCapacity;
    }
    public void setMaxCapacity(int maxCapacity)
    {
        this.maxCapacity = maxCapacity;
    }
    public void setCurrentCapacity(int currentCapacity)
    {
        this.currentCapacity = currentCapacity;
    }
}
