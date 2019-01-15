package com.zhanglin.networkSlicingBackend.ms.controller;

import com.zhanglin.networkSlicingBackend.ms.exception.MyException;
import com.zhanglin.networkSlicingBackend.ms.model.CreateTerminalRequest;
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
@RequestMapping("api/terminal")
public class terminalController {

    /**
     *
     * @param createTerminalRequest
     * @return
     * @throws MyException
     */
    @ApiOperation(value = "create a slice", notes = "")
    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object createSlice(@RequestBody @Valid CreateTerminalRequest createTerminalRequest) throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }


    /**
     *
     * @param terminalId
     * @return
     * @throws MyException
     */
    @ApiOperation(value = "delete a terminal", notes = "")
    //@JsonView(.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "terminal_id", value = "the terminal_id to delete", paramType = "query", defaultValue = "t01", required = true)
    })
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object deleteSlice(@RequestParam(value = "terminal_id", required = true) String terminalId) throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }

    @ApiOperation(value = "get terminal list ", notes = "")
    //@JsonView(.class)
    @ApiImplicitParams({})
    @ResponseBody
    @RequestMapping(value = "/terminal_list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getAllTerminal() throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }


    @ApiOperation(value = "select a slice", notes = "")
    //@JsonView(.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "terminal_id", value = "the terminal_id to select slice", paramType = "query", defaultValue = "t01", required = true),
            @ApiImplicitParam(name = "slice_id", value = "the slice_id to be selected", paramType = "query", defaultValue = "00000001", required = true)

    })
    @ResponseBody
    @RequestMapping(value = "/selectSlice", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object addSwitch2Slice(@RequestParam(value = "terminal_id", required = true) String sliceId,
                                  @RequestParam(value = "slice_id", required = true) String dpid_id) throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }

}