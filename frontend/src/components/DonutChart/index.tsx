import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/requests';

type ChartData = {
    labels: string[];
    series: number[];
}

//grafico de rosca
const DonutChart = () => {

    const [chartData, setChartData] = useState<ChartData>({ labels: [], series: [] }); //mantem estado do componente

    useEffect(() => { //Executa algo na instanciação ou destruição do componente, observa estado
        //forma certa
        axios.get(`${BASE_URL}/sales/amount-by-seller`)
            .then(response => {
                const data = response.data as SaleSum[];
                const myLabels = data.map(x => x.sellerName);
                const mySeries = data.map(x => x.sum);

                setChartData({ labels: myLabels, series: mySeries });

            });
    }, []);

    const options = {
        legend: {
            show: true
        }
    }


    return (
        <Chart //grafico
            options={{ ...options, labels: chartData.labels }}
            series={chartData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;