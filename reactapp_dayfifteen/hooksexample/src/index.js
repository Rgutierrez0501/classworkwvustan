import ReactDOM from 'react-dom';
import CounterApp from './component/CounterApp';
import Student from './component/Student';
import Greet from './component/useEffectExample/Greet';
import UserForm from './component/UserForm';

ReactDOM.render(
    //<CounterApp />,
    //<Student />,
    //<UserForm />,
    <Greet name='Mathew'/>,
    document.getElementById('root')
);
