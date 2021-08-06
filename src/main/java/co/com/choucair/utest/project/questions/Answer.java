package co.com.choucair.utest.project.questions;

import co.com.choucair.utest.project.userinterface.JoinCompletePage;
import co.com.choucair.utest.project.userinterface.JoinPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private  String question;

    public Answer(String question){
        this.question =question;
    }
    public static Answer toThe(String question) {
        return new Answer (question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String password = Text.of(JoinCompletePage.INPUT_CONFIRM_PASSWORD).viewedBy(actor).asString();
        if (question.equals(password)){
            result =true;
        }else {
            result=false;
        }
        return result;
    }
}
