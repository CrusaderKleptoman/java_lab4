package ZiminN_ISTb_21_2_lab4;

abstract public class BaseFigure {
    String figureName;
    float figureHeight;
    PaintStatus paintStatus;
    PaintLevel paintLevel;

    public BaseFigure(String name, float height)
    {
        figureName = name;
        figureHeight = height;
        paintStatus = PaintStatus.Unpaint;
        paintLevel = null;
    }

    public BaseFigure(String name, float height, PaintStatus status)
    {
        figureName = name;
        figureHeight = height;
        paintStatus = status;
        paintLevel = PaintLevel.ElementaryPaint;
    }

    public BaseFigure(String name, float height, PaintStatus status, PaintLevel level)
    {
        figureName = name;
        figureHeight = height;
        paintStatus = status;
        paintLevel = level;
    }

    public void setFigureName(String name) {figureName = name;}

    public void setPaintStatus(PaintStatus status)
    {
        paintStatus = status;
        if (paintStatus.equals(PaintStatus.FullPaint))
        {
            paintLevel = PaintLevel.ElementaryPaint;
        }
    }

    public void setPaintLevel(PaintLevel level) {paintLevel = level;}

    abstract public void assemblyFigure();
}