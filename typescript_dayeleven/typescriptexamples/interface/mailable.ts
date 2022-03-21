/**
 * Suppose that you have an interface called Mailable that contains two methods ca as followes
 * And you have many clasess that already implemented this interface.
 * Now you want to add a new method to this interface that sends an email later like this :
 * later(email:string,after: number): void 
 * All the classes which are implementing this interface will start giving error 
 * 
 */
interface Mailable{
    send(email :string) :boolean;
    queue(email :string) :boolean;
}

export type {Mailable};