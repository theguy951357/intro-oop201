package edu.unca.csci201;

import com.widgetsrus.factory.Widget;
import com.widgetsrus.factory.WidgetFactory;

public class QualityControl {

	public static void main(String[] args) {

		// makes 100 widgets and gives percentage of widgets greater than 8 and total
		// size of all widgets created.

		WidgetFactory wf = new WidgetFactory();
		Widget widget;
		double validWidget = 0;
		double widgetSizeTotal = 0;

		for (int i = 0; i < 100; i++) {
			widget = (Widget) wf.produceWidget();
			widgetSizeTotal += widget.getSize();
			if (widget.getSize() > 8) {
				validWidget++;
			}
		}

		double percent = validWidget / wf.getWidgetCount() * 100;

		System.out.println("The percentage of large widgets created out of the total is " + percent + "%");
		System.out.println("The total size of all the widgets created is " + widgetSizeTotal);

	}

}
