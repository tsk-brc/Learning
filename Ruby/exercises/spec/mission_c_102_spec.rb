require './app/mission_c_102.rb'

describe 'ライブチェック' do
  describe '出力結果のテスト' do
    before { allow($stdout).to receive(:puts) }
    let(:missionC102) { MissionC102.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "6\n", "12\n", "14\n", "15\n", "26\n", "27\n",
        "28\n", "5\n", "12\n", "13\n", "14\n", "15\n", "27\n"
      expect {
        missionC102.run }.to output("x\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\nA\nB\nB\nA\n" \
          "x\nx\nx\nx\nx\nx\nx\nx\nx\nx\nA\nB\nA\nx\nx\nx\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "3\n", "1\n", "2\n", "3\n",
        "3\n", "1\n", "2\n", "3\n"
      expect {
        missionC102.run }.to output("A\nB\nA\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\n" \
          "x\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\nx\n").to_stdout
    end
  end
end
