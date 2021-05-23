import { StatusBar } from 'expo-status-bar';
import React, { useState } from 'react';
import {SafeAreaView, Text} from 'react-native';

import Header from "./components/Header";
import Body from "./components/Body";
import Result from "./components/Result";


export default function App() {
  const [product, setProduct] = useState([])

  function addProductHandler(pName, pQuantity, pPrice) {

    setProduct((prevUsersList) => {
      return [
        ...prevUsersList,
        { id: Math.random().toString(), name: pName, quantity: pQuantity, price: pPrice },
      ];
    });
  }

  return (
    <SafeAreaView style={{flex: 1}}>
      <Header />
      <Body addProduct={addProductHandler}/>
      {!product ? <Result products={product} /> : <Text>Não há produtos</Text>}
    </SafeAreaView>
  ); 
}


