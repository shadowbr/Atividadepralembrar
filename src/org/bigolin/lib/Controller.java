
package org.bigolin.lib;

import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 *
 * @author Marcio Bigolin <marcio.bigolinn@gmail.com>
 */
public abstract class Controller implements Initializable{
    protected Stage stage;
    
    public void setStage(Stage st){
        this.stage = st;
    }
    
}
