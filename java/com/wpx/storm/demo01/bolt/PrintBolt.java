package com.wpx.storm.demo01.bolt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;



/**
 * 
 * 
 * 
 * @author wangpx
 */
public class PrintBolt extends BaseBasicBolt{

	private static final Log log=LogFactory.getLog(PrintBolt.class);
	
	private static final long serialVersionUID = 1L;

	@Override
	public void execute(Tuple tuple, BasicOutputCollector collector) {
		//��ȡ�ϸ����������Field
		String print = tuple.getStringByField("print");
		log.info("print : "+print);
		//���д��ݸ���һ��bolt
		collector.emit(new Values(print));
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("write"));
	}

}
