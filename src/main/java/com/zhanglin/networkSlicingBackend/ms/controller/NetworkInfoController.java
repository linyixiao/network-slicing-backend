package com.zhanglin.networkSlicingBackend.ms.controller;

import com.zhanglin.networkSlicingBackend.ms.exception.MyException;
import com.zhanglin.networkSlicingBackend.ms.service.impl.RyuRestService;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@CrossOrigin
@RequestMapping("api/networkInformation")
public class NetworkInfoController {

    @Autowired
    RyuRestService ryuRestService;

    @ApiOperation(value = "get all OVS switches", notes = "")
    @ApiImplicitParams({})
    @ResponseBody
    @RequestMapping(value = "/switches", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getAllSwitch() throws MyException {
        //'/v1.0/topology/switches'
        String mockUpData = " [{\"dpid\": \"0000000000000001\",\"packet_count\": 92319,\"byte_count\": 14092830,\"flow_count\": 3},\n" +
                "               {\"dpid\": \"0000000000000002\",\"packet_count\": 16784,\"byte_count\": 14092236,\"flow_count\": 3},\n" +
                "               {\"dpid\": \"0000000000000003\",\"packet_count\": 56745,\"byte_count\": 25092831,\"flow_count\": 3},\n" +
                "               {\"dpid\": \"0000000000000004\",\"packet_count\": 34675,\"byte_count\": 30092835,\"flow_count\": 3}, \n" +
                "               {\"dpid\": \"0000000000000005\",\"packet_count\": 89023,\"byte_count\": 41092840,\"flow_count\": 3}]";
        log.info("getAllSwitch ok");
       return mockUpData;
        //return ryuRestService.getSwitches();
    }

    @ApiOperation(value = "get all hosts", notes = "")
    @ApiImplicitParams({})
    @ResponseBody
    @RequestMapping(value = "/host", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getAllHost() throws MyException {
        String mockUpData = "[\n" +
                "        {\n" +
                "            \"port\": {\n" +
                "                \"hw_addr\": \"46:64:31:a2:d4:c1\",\n" +
                "                \"name\": \"s6-eth1\",\n" +
                "                \"port_no\": \"00000001\",\n" +
                "                \"dpid\": \"0000000000000006\"\n" +
                "            },\n" +
                "            \"mac\": \"00:00:00:00:00:02\",\n" +
                "            \"ipv4\": [\n" +
                "                \"10.0.0.2\"\n" +
                "            ],\n" +
                "            \"ipv6\": [\n" +
                "                \"fe80::200:ff:fe00:2\"\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"port\": {\n" +
                "                \"hw_addr\": \"ba:7c:a9:a9:74:d8\",\n" +
                "                \"name\": \"s1-eth1\",\n" +
                "                \"port_no\": \"00000001\",\n" +
                "                \"dpid\": \"0000000000000001\"\n" +
                "            },\n" +
                "            \"mac\": \"00:00:00:00:00:01\",\n" +
                "            \"ipv4\": [\n" +
                "                \"10.0.0.1\"\n" +
                "            ],\n" +
                "            \"ipv6\": [\n" +
                "                \"::\",\n" +
                "                \"fe80::200:ff:fe00:1\"\n" +
                "            ]\n" +
                "        }\n" +
                "    ]";

        return mockUpData;
//        return ryuRestService.getHost();
    }


    @ApiOperation(value = "get flow table" , notes = "")
    @ResponseBody
    @RequestMapping(value = "/flow_table", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getFlowTable(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {
        String mockUpData ="[\n" +
                "        {\n" +
                "            \"actions\": [\n" +
                "                \"OUTPUT:CONTROLLER\"\n" +
                "            ],\n" +
                "            \"idle_timeout\": 0,\n" +
                "            \"cookie\": 0,\n" +
                "            \"packet_count\": 119,\n" +
                "            \"hard_timeout\": 0,\n" +
                "            \"byte_count\": 7140,\n" +
                "            \"duration_sec\": 228,\n" +
                "            \"duration_nsec\": 347000000,\n" +
                "            \"priority\": 65535,\n" +
                "            \"length\": 96,\n" +
                "            \"flags\": 0,\n" +
                "            \"table_id\": 0,\n" +
                "            \"match\": {\n" +
                "                \"dl_type\": 35020,\n" +
                "                \"dl_dst\": \"01:80:c2:00:00:0e\"\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"actions\": [\n" +
                "                \"OUTPUT:1\"\n" +
                "            ],\n" +
                "            \"idle_timeout\": 0,\n" +
                "            \"cookie\": 0,\n" +
                "            \"packet_count\": 4,\n" +
                "            \"hard_timeout\": 0,\n" +
                "            \"byte_count\": 168,\n" +
                "            \"duration_sec\": 38,\n" +
                "            \"duration_nsec\": 880000000,\n" +
                "            \"priority\": 1,\n" +
                "            \"length\": 96,\n" +
                "            \"flags\": 0,\n" +
                "            \"table_id\": 0,\n" +
                "            \"match\": {\n" +
                "                \"dl_dst\": \"00:00:00:00:00:02\",\n" +
                "                \"in_port\": 1\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"actions\": [\n" +
                "                \"OUTPUT:CONTROLLER\"\n" +
                "            ],\n" +
                "            \"idle_timeout\": 0,\n" +
                "            \"cookie\": 0,\n" +
                "            \"packet_count\": 20856,\n" +
                "            \"hard_timeout\": 0,\n" +
                "            \"byte_count\": 3181948,\n" +
                "            \"duration_sec\": 228,\n" +
                "            \"duration_nsec\": 360000000,\n" +
                "            \"priority\": 0,\n" +
                "            \"length\": 80,\n" +
                "            \"flags\": 0,\n" +
                "            \"table_id\": 0,\n" +
                "            \"match\": {}\n" +
                "        }\n" +
                "    ]";
        return  mockUpData;
        //return ryuRestService.getLinks();
    }


    @ApiOperation(value = "get port info" , notes = "")
    @ResponseBody
    @RequestMapping(value = "/port_info", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getPortInfo(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {
        String mockUpData ="[{\n" +
                "                \"hw_addr\": \"ba:7c:a9:a9:74:d8\",\n" +
                "                \"name\": \"s1-eth1\",\n" +
                "                \"port_no\": \"00000001\",\n" +
                "                \"dpid\": \"0000000000000001\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"hw_addr\": \"9a:f3:6a:d5:87:ee\",\n" +
                "                \"name\": \"s1-eth2\",\n" +
                "                \"port_no\": \"00000002\",\n" +
                "                \"dpid\": \"0000000000000001\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"hw_addr\": \"02:52:68:22:1e:ea\",\n" +
                "                \"name\": \"s1-eth3\",\n" +
                "                \"port_no\": \"00000003\",\n" +
                "                \"dpid\": \"0000000000000001\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"hw_addr\": \"0a:da:86:06:72:e2\",\n" +
                "                \"name\": \"s1-eth4\",\n" +
                "                \"port_no\": \"00000004\",\n" +
                "                \"dpid\": \"0000000000000001\"\n" +
                "            }]";
        return mockUpData;
//        return ryuRestService.getLinks();
    }

    @ApiOperation(value = "get port traffic info" , notes = "")
    @ResponseBody
    @RequestMapping(value = "/port_traffic_info", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getPortTrafficInfo(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {

        String mockUpData ="[\n" +
                "            {\n" +
                "                \"tx_dropped\": 0,\n" +
                "                \"rx_packets\": 0,\n" +
                "                \"rx_crc_err\": 0,\n" +
                "                \"tx_bytes\": 0,\n" +
                "                \"rx_dropped\": 28194,\n" +
                "                \"port_no\": \"LOCAL\",\n" +
                "                \"rx_over_err\": 0,\n" +
                "                \"rx_frame_err\": 0,\n" +
                "                \"rx_bytes\": 0,\n" +
                "                \"tx_errors\": 0,\n" +
                "                \"duration_nsec\": 459000000,\n" +
                "                \"collisions\": 0,\n" +
                "                \"duration_sec\": 316,\n" +
                "                \"rx_errors\": 0,\n" +
                "                \"tx_packets\": 0\n" +
                "            },\n" +
                "            {\n" +
                "                \"tx_dropped\": 0,\n" +
                "                \"rx_packets\": 14634,\n" +
                "                \"rx_crc_err\": 0,                  \n" +
                "                \"tx_bytes\": 2137552,\n" +
                "                \"rx_dropped\": 0,\n" +
                "                \"port_no\": 1,\n" +
                "                \"rx_over_err\": 0,\n" +
                "                \"rx_frame_err\": 0,\n" +
                "                \"rx_bytes\": 2223199,\n" +
                "                \"tx_errors\": 0,\n" +
                "                \"duration_nsec\": 468000000,\n" +
                "                \"collisions\": 0,\n" +
                "                \"duration_sec\": 316,\n" +
                "                \"rx_errors\": 0,\n" +
                "                \"tx_packets\": 14030\n" +
                "            },\n" +
                "            {\n" +
                "                \"tx_dropped\": 0,\n" +
                "                \"rx_packets\": 14270,\n" +
                "                \"rx_crc_err\": 0,\n" +
                "                \"tx_bytes\": 2183274,\n" +
                "                \"rx_dropped\": 0,\n" +
                "                \"port_no\": 2,\n" +
                "                \"rx_over_err\": 0,\n" +
                "                \"rx_frame_err\": 0,\n" +
                "                \"rx_bytes\": 2171743,\n" +
                "                \"tx_errors\": 0,\n" +
                "                \"duration_nsec\": 469000000,\n" +
                "                \"collisions\": 0,\n" +
                "                \"duration_sec\": 316,\n" +
                "                \"rx_errors\": 0,\n" +
                "                \"tx_packets\": 14368\n" +
                "            }\n" +
                "    ]";
        return mockUpData;
//        return ryuRestService.getPortStats(switchId);
    }


    @ApiOperation(value = "get network topology", notes = "")
    @ResponseBody
    @RequestMapping(value = "/network_topology", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getNetworkTopology() throws MyException {
        String mockUpData = "{\n" +
                "        \"nodes\": [\n" +
                "        {\n" +
                "        \"name\": \"node-122\",\n" +
                "        \"vmType\": \"server\",\n" +
                "        \"image\": \"image/hosting_server.ico\"\n" +
                "        }, {\n" +
                "        \"name\": \"dst1\",\n" +
                "        \"vmType\": \"1\",\n" +
                "        \"image\": \"image/host.ico\"\n" +
                "        }, {\n" +
                "        \"name\": \"vnf1\",\n" +
                "        \"vmType\": \"2\",\n" +
                "        \"image\": \"image/host.ico\"\n" +
                "        }, {\n" +
                "        \"name\": \"node-123\",\n" +
                "        \"vmType\": \"server\",\n" +
                "        \"image\": \"image/wifi.ico\"\n" +
                "        }, {\n" +
                "        \"name\": \"vnf2\",\n" +
                "        \"vmType\": null,\n" +
                "        \"image\": \"image/router.svg\"\n" +
                "        }, {\n" +
                "        \"name\": \"src1\",\n" +
                "        \"vmType\": \"0\",\n" +
                "        \"image\": \"image/router.svg\"\n" +
                "        }\n" +
                "\n" +
                "        ],\n" +
                "        \"lines\": [\n" +
                "        {\n" +
                "        \"source\": 0,\n" +
                "        \"target\": 1,\n" +
                "        \"active\": true\n" +
                "        }, {\n" +
                "        \"source\": 0,\n" +
                "        \"target\": 2,\n" +
                "        \"active\": true\n" +
                "        }, {\n" +
                "        \"source\": 0,\n" +
                "        \"target\": 3,\n" +
                "        \"active\": false\n" +
                "        }, {\n" +
                "        \"source\": 3,\n" +
                "        \"target\": 4,\n" +
                "        \"active\": false\n" +
                "        }, {\n" +
                "        \"source\": 3,\n" +
                "        \"target\": 5,\n" +
                "        \"active\": true\n" +
                "        }\n" +
                "        ]\n" +
                "        }";
        log.info("get network_topology ok");
        return mockUpData;
    }

    }



