import * as React from 'react';
import { SafeAreaView } from 'react-native';

import Header from './components/Header';
import Body from "./components/Body";


export default class App extends React.Component {

    render(){
        return (
            <SafeAreaView style={{flex: 1}}>
                <Header />
                <Body />
            </SafeAreaView>
        );
    }
}




