import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//Default export :- is the value that will be imported from the module, if we use the simple import statement like below
// Employee is the name that will be given locally to the variable assigned to contain the value, and it doesn't 
//have to be named like the origin export.There can only be one default export 
//import Employee from './component/Employee';
import Flower from './component/Flower';
import Employee from './component/Employee';
import Student from './component/Student';
import Car  from './component/Car';
import Message from './component/Message';
import FootBall from './component/EventsExample';
import FootBallMsg from './component/FootBall';

// Using render method we are rendering the component
ReactDOM.render(
  <React.StrictMode>
   <Employee />
   <Flower color ="white" name ="lily"/>
   <Student />
   <Car />
   <Message greetings="Good Afternoon every one"/>
   <FootBall />
   <FootBallMsg />

  </React.StrictMode>,
  document.getElementById('root')
);


