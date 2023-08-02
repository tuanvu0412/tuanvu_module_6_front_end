import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import "bootstrap/dist/css/bootstrap.css";
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import ListMusic from './components/musicList';
import CreateMusic from './components/createMusic';
import Footer from './components/footer';
import Header from './components/header';
import UpdateMusic from './components/updateMusic';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
    <Header></Header>
      <Routes>
        <Route path='/' element={<ListMusic></ListMusic>}></Route>
        <Route path='/createMusic' element={<CreateMusic></CreateMusic>}></Route>
        <Route path='/editMusic/:id' element={<UpdateMusic></UpdateMusic>}></Route>
      </Routes>
      <Footer></Footer>
    </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
