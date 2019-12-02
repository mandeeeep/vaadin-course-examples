package it.zero11.vaadin.course.components;

import java.awt.Color;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("circle-percent")
@NpmPackage(value = "@manufosela/circle-percent", version = "2.2.1")
@JsModule("@manufosela/circle-percent/circle-percent.js")
public class CircleComponent extends Component{

	public void setPercent(double percentage) {
		getElement().setProperty("percent", percentage);
	}
	
	public void setColor(String color) {
		getElement().setProperty("scolor", color);
	}
}
