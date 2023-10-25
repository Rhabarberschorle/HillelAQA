package Lesson15_JavascriptExecutor;

public enum Buttons {
    ALERT("Click for JS Alert", "jsAlert()"),
    CONFIRM("Click for JS Confirm", "jsConfirm()"),
    PROMPT("Click for JS Prompt", "jsPrompt()");

    private String text;
    private String jsScript;

    Buttons(String s, String jsScript) {
        this.text = s;
        this.jsScript = jsScript;
    }

    public String getText() {
        return text;
    }
}
