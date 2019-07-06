import React, {Component} from 'react';
import './App.css';
import { makeStyles } from '@material-ui/core/styles';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Card from '@material-ui/core/Card';
import Button from '@material-ui/core/Button';

const styles = makeStyles({
  card: {
    minWidth: 275
  }
});

class App extends Component {
  state = {
    response: ''
  };

  componentDidMount() {
    this.callApi()
      .then(res => this.setState({ response: res.express }))
      .catch(err => console.log(err));
  }

  callApi = async () => {
    const response = await fetch('/api/mensagem');
    const body = await response.json();
    if (response.status !== 200) throw Error(body.message);

    return body;
  };

  render() {
    return (
      <Card className={styles.card}>
      <CardContent>
          Word of the Day
      </CardContent>
      <CardActions>
        <Button>Learn More</Button>
      </CardActions>
    </Card>
    );
  }
}

export default App;