package t3_43;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;




public class MiControl extends Region
{    
     // En este caso se utiliza MouseEvent aquí solo porque llama desde onMouseEvent, se puede sustituir por cualquier tipo que se necesite
    private ObjectProperty<EventHandler<MouseEvent>> propertyOnAction = new SimpleObjectProperty<EventHandler<MouseEvent>>();
    
    //Construxtor
    public MiControl()
    {
        super();
        // marca la zona donde hacer click
        setStyle("-fx-border-color:red;");
        setPrefSize(100, 100);
        
        this.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) 
            {
                onActionProperty().get().handle(event);
            }
        });
    }

    
 public final ObjectProperty<EventHandler<MouseEvent>> onActionProperty() 
 {
 return propertyOnAction;

 }
 public final void setOnAction(EventHandler<MouseEvent> handler) 
 {
    propertyOnAction.set(handler);
 }
 public final EventHandler<MouseEvent> getOnAction() 
 {
    return propertyOnAction.get();
 }
 
}//Fin de clase
