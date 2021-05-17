package edu.unca.csci201;

public class Tree {

	private String treeType;
	private double height;
	private double width;

	public Tree(String treeType, double height, double width) {
		this.treeType = treeType;
		this.height = height;
		this.width = width;
	}

	public String getTreeType() {
		return treeType;
	}

	public void setTreeType(String treeType) {
		this.treeType = treeType;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getVolume() {
		return this.height * this.width;
	}

}
