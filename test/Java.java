import org.frice.game.Game;
import org.frice.game.obj.button.ImageButton;
import org.frice.game.resource.image.ImageResource;

/**
 * Created by Administrator on 2016/9/15 0015.
 *
 * @author ice1000
 */
public class Java extends Game {
	@Override
	public void onInit() {
		super.onInit();
		addObject(new ImageButton(
				ImageResource.fromWeb("http://img.blog.csdn.net/20151123175207052"),
				ImageResource.fromWeb("http://img.blog.csdn.net/20151123175205567"),
				50, 50));
	}

	public static void main(String[] args) {
		new Java();
	}
}
