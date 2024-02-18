public abstract class  Iot {
    IotMediator mediator;
    public void setMediator(IotMediator mediator){
        this.mediator = mediator;
    }
    
    public abstract void doTask();
}
