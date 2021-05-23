import React, { Component } from 'react';
import {StyleSheet, Text, View} from 'react-native';
import { Table, Row, Rows } from 'react-native-table-component';

export default class Result extends Component {
    constructor(props) {
        super(props);
        this.state = {
            tableHead: ['Descrição', 'Q', 'PU'],
            tableData: this.props.products
        }
    }

    render() {
        const state = this.state;
        return (
            <View style={styles.container}>
                <Table borderStyle={{borderWidth: 2, borderColor: '#c8e1ff'}}>
                    <Row data={state.tableHead} style={styles.head} textStyle={styles.text}/>
                    <Rows data={state.tableData} textStyle={styles.text}/>
                </Table>

                <View style={styles.result}>
                    <Text style={styles.resultText}>Total: R$ {}</Text>
                </View>

            </View>

        )
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        paddingTop: 20,
        backgroundColor: '#fff'
    },
    head: {
        height: 40,
        backgroundColor: '#f1f8ff'
    },
    text: {
        textAlign: 'center',
        margin: 6,
    },
    result: {
        flexWrap: 'wrap',
        justifyContent: 'flex-end',
        flexDirection: 'row',
        backgroundColor: '#e91c5d',
        height: 40,
        alignItems: 'center',
    },
    resultText:{
        flex: 1,
        textAlign: 'right',
        fontSize: 20,
        color: 'white',
    },
});