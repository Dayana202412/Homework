class Bowl {
    private int amountFood = 0;

    public Bowl(int amountFood) {
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
        if (amount < 0) {
            System.out.println("Нельзя добавить отрицательное количество еды");
            return;
        }

        amountFood += amount;
        System.out.println("В миску добавили " + amount + " еды. Теперь в миске " + amountFood + " еды.");
    }
}









































