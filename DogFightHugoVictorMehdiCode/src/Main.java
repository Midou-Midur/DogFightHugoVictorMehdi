import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.dogfight.controller.DogFightController;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.IUserOrder;

public abstract class Main {
    public static void main(final String[] args){
        final DogfightModel dogfightModel = new DogfightModel();
        final DogfightController dogfightController = new DogfightController(dogfightModel);
        final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
        dogfightController.setViewSystem(dogfightView);
        dogfightController.play();

    }

}
