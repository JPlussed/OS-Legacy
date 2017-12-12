public class Slider {
    
  /*  private int position = 86;
    
    private double value;
    
    private int x, y;
    
    private final double minValue, maxValue, length;
    
    private final Sprite[] images = new Sprite[2];
    
    public Slider(Sprite icon, Sprite background, double minimumValue, double maximumValue) {
        this.images[0] = icon;
        this.images[1] = background;
        this.minValue = this.value = minimumValue;
        this.maxValue = maximumValue;
        this.length = this.images[1].myWidth;
    }
    
    public void draw(int x, int y) {
        this.x = x;
        this.y = y;
        images[1].drawSprite(x, y);
        images[0].drawSprite(x + position - (int) (position / length * images[0].myWidth), y - images[0].myHeight / 2 + images[1].myHeight / 2);
    }
    
    public void handleClick(int mouseX, int mouseY, int offsetX, int offsetY, int contentType) {
        if (RSApplet.mouseX - offsetX >= x && RSApplet.mouseX - offsetX <= x + length 
                   && RSApplet.mouseY - offsetY >= y + images[1].myHeight / 2 - images[0].myHeight / 2 
                   && RSApplet.mouseY - offsetY <= y + images[1].myHeight / 2 + images[0].myHeight / 2)                 
        {
            position = mouseX - x - offsetX;
            if (position >= length) {
                position = (int) length;
            }
            if (position <= 0) {
                position = 0;
            }
            value = minValue + ((mouseX - x - offsetX) / length) * (maxValue - minValue);
            if (value < minValue) {
                value = minValue;
            }
            if (value > maxValue) {
                value = maxValue;
            }
            switch(contentType) {
            case 1:
                Rasterizer.method372(minValue + maxValue - value);
                break;
            }
        }
    }
    
     public double getPercentage() {
        return ((position / length) * 100);
     }*/

}