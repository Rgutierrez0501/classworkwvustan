import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Login from './Login';
import UserRegistration from './UserRegistration';
import Home from './Home';
function App(){
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/login" element={<Login />} />
                <Route path="/userregistration" element={<UserRegistration />} />
                <Route path="/" element={<Home />} />

            </Routes>
        </BrowserRouter>
    );
}
export default App;