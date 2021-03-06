<section class="invoice-container">
                                <div class="invoice-inner">
                                    <div class="row">
                                        <div class="col-6">
                                            <h3>Invoice</h3>
                                        </div>
                                        <div class="col-6 text-right">
                                            <h3>Order # 12345</h3>
                                        </div>
                                    </div>
                                    <hr/>
                                    <div class="row">
                                        <div class="col-6">
                                            <address>
                                                <strong>Billed To:</strong><br />
                                                John Smith<br />
                                                1234 Main<br />
                                                Apt. 4B<br />
                                                Springfield, ST 54321
                                            </address>
                                        </div>
                                        <div class="col-6 text-right">
                                            <address>
                                                <strong>Shipped To:</strong><br />
                                                Jane Smith<br />
                                                1234 Main<br />
                                                Apt. 4B<br />
                                                Springfield, ST 54321
                                            </address>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-6">
                                            <strong>Payment Method:</strong>
                                            <br /> Visa ending **** 4242
                                             
                                        </div>
                                        <div class="col-6 text-right">
                                            <strong>Order Date:</strong>
                                            <br />${date}
                                            
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-12 pad-top">
                                            <div class="panel panel-default">
                                                <div class="panel-heading">
                                                    <h3 class="panel-title">Order summary</h3>
                                                </div>
                                                <div class="panel-body">
                                                    <div class="table-responsive">
                                                        <table class="table table-condensed">
                                                            <thead>
                                                                <tr>
                                                                    <td><strong>Item</strong></td>
                                                                    <td class="text-center"><strong>Price</strong></td>
                                                                    <td class="text-center"><strong>Quantity</strong></td>
                                                                    <td class="text-right"><strong>Totals</strong></td>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <tr>
                                                                    <td>BS-200</td>
                                                                    <td class="text-center">$10.99</td>
                                                                    <td class="text-center">1</td>
                                                                    <td class="text-right">$10.99</td>
                                                                </tr>
                                                                <tr>
                                                                    <td>BS-400</td>
                                                                    <td class="text-center">${price}</td>
                                                                    <td class="text-center">3</td>
                                                                    <td class="text-right">$60.00</td>
                                                                </tr>
                                                                <tr>
                                                                    <td>BS-1000</td>
                                                                    <td class="text-center">$600.00</td>
                                                                    <td class="text-center">1</td>
                                                                    <td class="text-right">$600.00</td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="thick-line"></td>
                                                                    <td class="thick-line"></td>
                                                                    <td class="thick-line text-center"><strong>Subtotal</strong></td>
                                                                    <td class="thick-line text-right">$670.99</td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="no-line"></td>
                                                                    <td class="no-line"></td>
                                                                    <td class="no-line text-center"><strong>Shipping</strong></td>
                                                                    <td class="no-line text-right">$15</td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="no-line"></td>
                                                                    <td class="no-line"></td>
                                                                    <td class="no-line text-center"><strong>Total</strong></td>
                                                                    <td class="no-line text-right">$685.99</td>
                                                                </tr>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="text-center no-print"> 
                                      <a class="btn btn-primary btn-lg" onClick="jQuery('#page-content').print()">
                                        <i class="fa fa-print"></i> Print
                                      </a> 
                                    </div>
                                </div>
                            </section>
