import pl.shockah.easyslick.App;
import pl.shockah.easyslick.Entity;
import pl.shockah.easyslick.EntityEventReflection;
import pl.shockah.easyslick.GraphicsHelper;
import pl.shockah.easyslick.IAppHooks;
import pl.shockah.easyslick.Room;

public class Main implements IAppHooks {

	public void onInit() {
		App.start(new Main(), new RoomGame(),"TankEditor");
	}
	
	public static class RoomGame extends Room {
		public RoomGame() {
			maxFPS = 60;
			size.x = viewSize.x = 800;
			size.y = viewSize.y = 600;
		}
	}
	
	public void onDeinit() {
		// TODO Auto-generated method stub
		
	}


	public void onTick(int delta) {
		// TODO Auto-generated method stub
		
	}


	public void preRender(GraphicsHelper gh) {
		// TODO Auto-generated method stub
		
	}


	public void onRender(GraphicsHelper gh) {
		// TODO Auto-generated method stub
		
	}


	public void onException(Throwable t) {
		// TODO Auto-generated method stub
		
	}

}
