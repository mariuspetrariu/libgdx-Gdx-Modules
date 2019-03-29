package gdxmodules.sample;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;

public class GdxModules extends ApplicationAdapter
    {
        private static final Logger      LOGGER_INFO = new Logger ( GdxModules.class.getName () , Logger.INFO );
        private              SpriteBatch batch;
        private              Texture     img;

        @Override
        public void create ()
            {
                LOGGER_INFO.info ( "Gdx.app = " + Gdx.app );
                LOGGER_INFO.info ( "Gdx.graphics = " + Gdx.graphics );
                LOGGER_INFO.info ( "Gdx.input = " + Gdx.input );
                LOGGER_INFO.info ( "Gdx.audio =  " + Gdx.audio );
                LOGGER_INFO.info ( "Gdx.files = " + Gdx.files );
                LOGGER_INFO.info ( "Gdx.net = " + Gdx.net );
                batch = new SpriteBatch ();
                img = new Texture ( "badlogic.jpg" );
            }

        @Override
        public void render ()
            {
                Gdx.gl.glClearColor ( 1 , 0 , 0 , 1 );
                Gdx.gl.glClear ( GL20.GL_COLOR_BUFFER_BIT );
                batch.begin ();
                batch.draw ( img , 0 , 0 );
                batch.end ();
            }

        @Override
        public void dispose ()
            {
                batch.dispose ();
                img.dispose ();
            }
    }
