class Bowl {
    private int amountFood;

    public Bowl(int foodAmount) {
        this.amountFood = amountFood;
    }

    public int getFoodAmount() {
        return amountFood;
    }

    public void decreaseFood(int amount) {
        if (amount <= amountFood) {
            amountFood -= amount;
        } else {
            System.out.println("В миске недостаточно еды");
        }
    }

    public void addFood(int amount) {
        amountFood += amount;
        System.out.println("В миску добавили " + amount + " еды. Теперь в миске " + amountFood + " еды.");
    }
}





























