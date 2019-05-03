package jpu2016.dogfight.controller;

public abstract class DogFightController implements IOrderPerformer {
    private int TIME_SLEEP = 30;

    public DogFightController(IDogfightModel dogfightModel) {
    }

    public void orderPerform(UserOrder userOrder) {
    }

    public void play() {
    }

    public void setViewSystem(IViewSysteme viewSystem) {
    }

    private void lauchMissile(int player) {
    }

    private void gameLoop() {
    }
}
