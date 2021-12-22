package edu.citytech.cst.s23370098.dynamicpage.model.form;

public class ABCForm {
    protected String displayMode = "all";
    private String message;

    public String getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ABCForm{" +
                "displayMode='" + displayMode + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
