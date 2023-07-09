package uta.cse3310;

public class EventMessage {
  String type;
  Object content;

  EventMessage(String _type, Object _msg) {
    type = _type;
    content = _msg;
  }
  
}
