import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Login from './Login';
//import UserRegistration from './UserRegistration';
import Home from './Home';
function App(){
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/home" element={<Home />} />
                <Route path="/login" element={<Login />} />
                
            </Routes>
        </BrowserRouter>
    );
}
export default App;