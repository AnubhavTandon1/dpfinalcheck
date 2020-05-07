package com.ObserverPatt;

public class NotificationSubscriber implements Observer {
	
	private String name;
	private Subject topic;
	
	public NotificationSubscriber(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new Notification");
		}else
		System.out.println(name+":: Consuming Notification::"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
	}

}
