public class coffee
	{
		String type;
		String size;
		double sugar;
		double espresso;
	
		public coffee (String t, String si, double s, double e)
		{
		type = t;
		size=si;
		sugar = s;
		espresso = e;
		}

		public String getType()
			{
				return type;
			}

		public void setType(String type)
			{
				this.type = type;
			}

		public String getSize()
			{
				return size;
			}

		public void setSize(String size)
			{
				this.size = size;
			}

		public double getSugar()
			{
				return sugar;
			}

		public void setSugar(double sugar)
			{
				this.sugar = sugar;
			}

		public double getEspresso()
			{
				return espresso;
			}

		public void setEspresso(double espresso)
			{
				this.espresso = espresso;
			}

	}