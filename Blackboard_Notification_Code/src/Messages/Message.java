package messages;

import gateways.Gateway;

public class Message {

    DailyNewsMessage dailyNewsMessage;
    GradesAnnouncementMessage gradesAnnouncementMessage;
    TaskAddedMessage taskAddedMessage;
    Gateway gateway;

    public void setGradesAnnouncementMessage(GradesAnnouncementMessage gradesAnnouncementMessage) {
        this.gradesAnnouncementMessage = gradesAnnouncementMessage;
    }

    public void setTaskAddedMessage(TaskAddedMessage taskAddedMessage) {
        this.taskAddedMessage = taskAddedMessage;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setDailyNewsMessage(DailyNewsMessage dailyNewsMessage) {
        this.dailyNewsMessage = dailyNewsMessage;
    }

    public DailyNewsMessage getDailyNewsMessage() {
        return dailyNewsMessage;
    }

    public GradesAnnouncementMessage getGradesAnnouncementMessage() {
        return gradesAnnouncementMessage;
    }

    public TaskAddedMessage getTaskAddedMessage() {
        return taskAddedMessage;
    }

    public Gateway getGateway() {
        return gateway;
    }

    public String dailyNewsMessage(String[] placeholders, String email){
        return gateway.sendDailyNewsMessage(dailyNewsMessage, placeholders, email);
    }

    public String gradesAnnouncementMessage(String[] placeholders, String email){
        return gateway.sendGradesAnnouncementMessage(gradesAnnouncementMessage, placeholders, email);
    }

    public String taskAddedMessage(String[] placeholders, String email){
        return gateway.sendTaskAddedMessage(taskAddedMessage, placeholders, email);
    }

}
