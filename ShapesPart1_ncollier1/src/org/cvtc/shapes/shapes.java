package org.cvtc.shapes;


// Abstract class
	abstract class Shape{
		public abstract float surfaceArea();
		public abstract float volume();
		public abstract String render(); 
	}

	class Cuboid extends Shape {

	// Fields
	private float width = 0;
	private float height = 0;
	private float depth = 0;
	
	// Constructor
	public Cuboid(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	// Getters and Setters
	public float getWidth() {
		return width;
	}

	private void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	private void setDepth(float depth) {
		this.depth = depth;
	}
	
	
	
	
	
	
	// Overrides

	@Override
	public float surfaceArea() {
		// TODO Auto-generated method stub
		final float surfaceArea = width * height;
		
		return surfaceArea;
	}

	

	@Override
	public float volume() {
		// TODO Auto-generated method stub
		final float volume = depth * width * height;
		return volume;
	}

	@Override
	public String render() {
		// TODO Auto-generated method stub
		return "The Cubes dimensions are: depth " + depth + " x width " + width + " x height " + height + "\n surfaceArea is " + surfaceArea() + "\n volume is " + volume();
	}
	}

	class Cylinder extends Shape {
		
		// Fields 
		private float radius = 0;
		private float height = 0;
		
		// Constructor
		public Cylinder(float radius, float height) {
			this.radius = radius;
			this.height = height;
		}
		
		// Getters and Setters
		public float getRadius() {
			return radius;
		}

		private void setRadius(float radius) {
			this.radius = radius;
		}

		public float getHeight() {
			return height;
		}

		private void setHeight(float height) {
			this.height = height;
		}

		// Overrides 
		@Override
		public float surfaceArea() {
			// TODO Auto-generated method stub
			final float surfaceArea = (float) (2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, radius))  ;
			
			return surfaceArea;
		}

		

		@Override
		public float volume() {
			// TODO Auto-generated method stub
			final float volume = (float) (Math.PI * Math.pow(radius, radius) * height);
			return volume;
		}

		@Override
		public String render() {
			// TODO Auto-generated method stub
			return "The Cylinders dimensions are: radius "  + radius + " x height " + height + "\n surfaceArea is " + surfaceArea() + "\n volume is " + volume();
		}
		
		
		
	}
	
	class Sphere extends Shape {
		
		// Fields
		private float radius = 0;
		
		// Constructor
		public Sphere(float radius) {
			
			
			}
		
		// Getters and Setters
		public float getRadius() {
			return radius;
		}

		private void setRadius(float radius) {
			this.radius = radius;
		}

		
		
		// Overrides 

		@Override
		public float surfaceArea() {
			// TODO Auto-generated method stub
			final float surfaceArea = (float) (4 * Math.PI * Math.pow(radius, radius));
			
			return surfaceArea;
		}

		
		@Override
		public float volume() {
			// TODO Auto-generated method stub
			final float volume = (float) ((4/3) * Math.PI * Math.pow(radius, radius));
			return volume;
		}

		@Override
		public String render() {
			// TODO Auto-generated method stub
			return "The Spheres dimensions are " + radius + "\n surfaceArea is " + surfaceArea() + "\n volume is " + volume();
		}
		}
	

	
		
