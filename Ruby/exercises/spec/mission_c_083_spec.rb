require './app/mission_c_083.rb'

describe 'グラフ作成チェック' do
  describe '出力結果のテスト' do
    let(:missionC083) { MissionC083.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3 5\n",
      "5\n",
      "15\n",
      "10\n"
      expect($stdout).to receive(:puts).with('1:*..')
      expect($stdout).to receive(:puts).with('2:***')
      expect($stdout).to receive(:puts).with('3:**.')
      missionC083.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "4 2\n",
      "12\n",
      "8\n",
      "16\n",
      "10\n"
      expect($stdout).to receive(:puts).with('1:******..')
      expect($stdout).to receive(:puts).with('2:****....')
      expect($stdout).to receive(:puts).with('3:********')
      expect($stdout).to receive(:puts).with('4:*****...')
      missionC083.run
    end
  end
end
