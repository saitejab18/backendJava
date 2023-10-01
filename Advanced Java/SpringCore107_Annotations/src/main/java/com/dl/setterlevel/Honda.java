package com.dl.setterlevel;

import org.springframework.beans.factory.annotation.Autowired;

public class Honda {

		private Model model;

		public Model getModel() {
			return model;
		}

		@Autowired
		public void setModel(Model model) {
			this.model = model;
		}

		@Override
		public String toString() {
			return "Honda [model=" + model + "]";
		}
}
