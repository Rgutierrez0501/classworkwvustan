import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Login from './Login';
//import UserRegistration from './UserRegistration';
import Home from './Home';
import UserRegistration from './UserRegistration';
function App(){
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/home" element={<Home />} />
                <Route path="/login" element={<Login />} />
                <Route path="/userregistration" element={<UserRegistration />} />
                
            </Routes>
        </BrowserRouter>
    );
}
export default App;