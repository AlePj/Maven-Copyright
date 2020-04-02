public class Copyright {
    private String text="Copyright (C) 1883 Alejandro Paniagua Jurado - All Rights Reserved You may use, distribute and modify this code under the terms of the XYZ license, which unfortunately won't be written for another century. You should have received a copy of the XYZ license with this file. If not, please visit : http://www.thomas-edison.com";
;    public Copyright() {
        this.text =text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Copyright{" +
                "text='" + text + '\'' +
                '}';
    }
}
