import { StatusBar } from 'expo-status-bar';
import React from 'react';
import {SafeAreaView} from 'react-native';

import Header from "./components/Header";
import Body from "./components/Body";
import Result from "./components/Result";


export default function App() {
  return (
    <SafeAreaView style={{flex: 1}}>
      <Header />
      <Body />
      <Result />
    </SafeAreaView>
  );
}


