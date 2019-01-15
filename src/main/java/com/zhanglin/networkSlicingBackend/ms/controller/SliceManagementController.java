package com.zhanglin.networkSlicingBackend.ms.controller;

import com.zhanglin.networkSlicingBackend.ms.entity.Slice;
import com.zhanglin.networkSlicingBackend.ms.exception.MyException;

import com.zhanglin.networkSlicingBackend.ms.model.CreateSliceRequest;
import com.zhanglin.networkSlicingBackend.ms.model.MyResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Slf4j
@RestController
@CrossOrigin
@RequestMapping("api/slice-management")
public class SliceManagementController {

    /**
     *
     * @param createSliceRequest
     * @return
     * @throws MyException
     */

    @ApiOperation(value = "create a slice", notes = "")
    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object createSlice(@RequestBody @Valid CreateSliceRequest createSliceRequest) throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }



    /**
     * @param sliceId
     * @return
     * @throws MyException
     */

    @ApiOperation(value = "delete a slice", notes = "")
    //@JsonView(.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "slice_id", value = "the slice_id to delete", paramType = "query", defaultValue = "001", required = true)
    })
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object deleteSlice(@RequestParam(value = "slice_id", required = true) String sliceId) throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }


    @ApiOperation(value = "get slice list ", notes = "")
    //@JsonView(.class)
    @ApiImplicitParams({})
    @ResponseBody
    @RequestMapping(value = "/slice_list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getAllSlice() throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }


    @ApiOperation(value = "add node", notes = "")
    //@JsonView(.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "slice_id", value = "the slice_id to add node", paramType = "query", defaultValue = "001", required = true),
            @ApiImplicitParam(name = "node_id", value = "the node_id added to slice", paramType = "query", defaultValue = "00000001", required = true)

    })
    @ResponseBody
    @RequestMapping(value = "/add_node", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object addSwitch2Slice(@RequestParam(value = "slice_id", required = true) String sliceId,
                                  @RequestParam(value = "node_id", required = true) String dpid_id) throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }

}